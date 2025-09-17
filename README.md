# boot-lite

> The Springboot Starter Template.

# Directory Structure

```markdown
boot-lite
├─src
│  ├─main
│  │  ├─java                        # 源码
│  │  │  └─com
│  │  │      └─example
│  │  │          ├─common           # 通用封装
│  │  │          ├─config           # 配置类
│  │  │          ├─controller       # 控制层
│  │  │          ├─enums            # 枚举类
│  │  │          ├─exception        # 自定义异常类
│  │  │          ├─filter           # 过滤器
│  │  │          ├─handler          # 自定义处理器
│  │  │          ├─mapper           # 数据访问层
│  │  │          ├─pojo             # 实体类
│  │  │          └─service          # 业务逻辑接口
│  │  │              └─impl         # 业务逻辑实现类
│  │  └─resources                   # 资源文件目录(配置文件/映射文件/静态资源)
│  └─test                           # 测试代码目录
│      └─java
│          └─com
│              └─example
└─pom.xml                           # Maven配置文件
```

## Request Example

```http request
POST http://localhost:8088/api/product/create
Content-Type: application/json

{
  "id": 1001,
  "name": "红茶礼盒",
  "description": "优质进口红茶礼盒装，适合送礼与自饮。",
  "price": 199.99,
  "stockQuantity": 50
}

```