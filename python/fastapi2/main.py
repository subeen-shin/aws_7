from fastapi import FastAPI, Query
import uvicorn
from pydantic import BaseModel, Field
app = FastAPI(title="AI Server")

class productCreate(BaseModel):
	id:int = Field(ge=1)
	title:str = Field(min_length=1)
	price:int = Field(ge=0)


products= [
	{ "id" : 1, "title" : "목걸이", "price" : 10000},
	{ "id" : 2, "title" : "반지", "price" : 100000},
	{ "id" : 3, "title" : "바지", "price" : 50000},
]

@app.get("/")
def home() :
	return { "message" : "fastapi 연결 성공"}


@app.get("/products/{product_id}")
def get_product(product_id:int):
	product = [p for p in products if p["id"] == product_id]

	return product[0] if len(product) != 0 else None

# 매개변수에 조건을 거는 방법을 설명(쿼리)
@app.get("/products")
def get_products(page:int = Query(default=1, ge=1)):

	return products[page-1:page] if page <= len(products) else None

# 여러 정보를 받을 때 클래스를 이용하는 방법
# BaseModel을 상속받은 클래스를 추가하여 가져옴
@app.post("/products")
def create_products(product: productCreate):
	print(product)
	return { "message" : "제품을 등록했습니다."}


if __name__ == "__main__":
	uvicorn.run("main:app", port=8000, reload=True)