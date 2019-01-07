[OSI七层模型](https://blog.csdn.net/taotongning/article/details/81352985)
[参考资料](http://www.cnblogs.com/xdp-gacl/p/5193279.html)
## 1、为什么使用websocket
Http协议是一种无状态的、无连接的，单向应用层协议，基于请求响应模型，请求只能由客户端发起，服务端做出响应。在实际业务中，
需要服务器主动向客户端发起消息，客使用http协议客户端获取消息比较麻烦（异步请求、轮询等方式处理，浪费资源，效率低，不及时），
WebSocket 连接允许客户端和服务器之间进行全双工通信，以便任一方都可以通过建立的连接将数据推送到另一端。
WebSocket 只需要建立一次连接，就可以一直保持连接状态。这相比于轮询方式的不停建立连接显然效率要大大提高。
## 2、什么是webSocket
网络通信协议
## 3、解决HTTP的问题
- 被动性 websocket允许服务器主动推送信息到客户端
## 4、javax.websocket
```
  <dependency>
       <groupId>javax</groupId>
       <artifactId>javaee-api</artifactId>
       <version>7.0</version>
       <scope>provided</scope>
     </dependency>
```
- @ServerEndpoint 标记这个类是WebSocket的处理器
- 类中使用下面的注解来表明所修饰的方法是触发事件的回调
~~~
1、@OnOpen 连接建立成功调用的方法
2、@OnClose 连接关闭调用的方法
3、@OnMessage 收到客户端消息后调用的方法
4、@OnError 发生错误时调用
~~~


