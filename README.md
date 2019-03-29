### Example Of Firebase Cloud Messaging - Server Side by Spring Boot

</br>


Override Method  on File<b>`FirebaseHandler.java`</b> 
 by your <b>Server Key</b>.
 
 ```java
 @Override
 protected String getFirebaseRemoteToken() {
     return "<your-server-key>";
 }
```
server key is accessible via <a href="https://console.firebase.google.com/">Firebase Console</a>


