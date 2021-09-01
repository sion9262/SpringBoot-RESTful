# SpringBoot-RESTful

### SpringBoot를 이용한 RESTful 예제 
#### 유저 생성, 조회, 삭제
#### 게시글 생성, 조회, 삭제

### API 정의 

|Description|REST API|HTTP Method|
|:---:|:---:|:---:|
|Retrieve all Users|/users|GET|
|Create a User|/users|POST|
|Retrieve one User|/users/{id}|GET|
|Delete a User|/users/{id}|DELETE|
|Retrieve all posts for a User|/users/{id}/posts|GET|
|Create a posts for a User|/users/{id}/posts|POST|
|Retrieve details of a User|/users/{id}/posts/{post_id}|GET|

