from fastapi import APIRouter, HTTPException, status

# PostController처럼 / posts로 시작하는 경로에 대한 처리

router = APIRouter(prefix="/posts", tags=["posts"])
