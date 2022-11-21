
from AbstractEvent import AbstractEvent
import json

class 배달완료됨(AbstractEvent):
    id : int
    
    def __init__(self):
        super().__init__()
        self.id = None

