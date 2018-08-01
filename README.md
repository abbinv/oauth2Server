# oauth2 hello world including authorisation server

#Bearer token creation CURLs :
 curl -X POST \
  'http://localhost:8090/oauth/token?grant_type=password&username=<anotheruser or user or admin>&password=password' \
  -H 'Authorization: Basic bXljbGllbnR1c2Vya2V5OnNlY3JldA==' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  
#resource calls :
  curl -X GET \
  http://localhost:8090/user/ \
  -H 'Authorization: Bearer 8c560454-8d23-46db-aec6-ad41ccd3e5b1' \
  
  curl -X GET \
  http://localhost:8090/admin/ \
  -H 'Authorization: Bearer 8c560454-8d23-46db-aec6-ad41ccd3e5b1' \
  
  curl -X GET \
  http://localhost:8090/anotheruser/ \
  -H 'Authorization: Bearer 8c560454-8d23-46db-aec6-ad41ccd3e5b1' \
