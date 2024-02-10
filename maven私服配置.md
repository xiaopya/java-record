### 私服配置说明

访问私服：http://192.xxx.xxx.xxx:8081

访问账密：admin/admin



使用私服，需要在maven的settings.xml配置文件中，做以下配置：

1. 需要在servers标签中，配置访问私服的个人品质

   ```xml
   <server>
       <id>maven-releases</id>
       <username>admin</username>
       <password>admin</password>
   </server>
   
   <server>
       <id>maven-snapshots</id>
       <username>admin</username>
       <password>admin</password>
   </server>
   ```

2. 在mirrors中只配置我们自己私服的连接地址（如果之前配置过阿里云，需要直接替换掉）

   ```xml
   <mirror>
       <id>maven-public</id>
   	<mirrorOf>*</mirrorOf>
       <url>http://192.xxx.xxx.xxx:8081/repository/maven-public</url>
   </mirror>
   ```

3. 需要在profiles中，增加如下配置，来指定snapshot快照版本的依赖，依然允许使用

   ```xml
   <profile>
   	<id>allow-snapshots</id>
       <activation>
       	<activeByDefault>true</activeByDefault>
       </activation>
       <repositories>
       	<repository>
           	<id>maven-public</id>
               <url>http://192.xxx.xxx.xxx:8081/repository/maven-public</url>
               <releases>
               	<enabled>true</enabled>
               </releases>
               <snapshots>
               	<enabled>true</enabled>
               </snapshots>
           </repository>
       </repositories>
   </profile>
   ```

4. 如果需要上传自己的项目到私服上，需要在项目的pom.xml文件中，增加以下配置，来配置项目发布的地址（也就是私服的地址）

   ```xml
   <distributionManagement>
   	<!-- release版本发布的地址 -->
       <repository>
       	<id>maven-releases</id>
   		<url>http://192.xxx.xxx.xxx:8081/repository/maven-public</url>
       </repository>
       
       <!-- snapshot版本发布的地址 -->
       <snapshotRepository>
       	<id>maven-releases</id>
   		<url>http://192.xxx.xxx.xxx:8081/repository/maven-public</url>
       </snapshotRepository>
   </distributionManagement>
   ```

5. 发布项目，直接运行deploy生命周期即可（期间建议调过单元测试）