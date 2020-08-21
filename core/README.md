### Getting Started Guide for Feast Core Developers

Pre-requisites:
- Build Feast as `./gradlew build -x check`
- A running Postgres instance. For easier to get started, please configure the database like so
  ```
  database: postgres
  user: postgres 
  password: password
  ``` 
- A running Redis instance
  ```
  host: localhost
  port: 6379
  ```
- Access to Google Cloud BigQuery (optional)
- Access to Kafka brokers (to test starting ingestion jobs from Feast Core)

Run the following command to start Feast Core GRPC service running on port 6565 locally
```bash
./bin/start-core.sh
```

The Spring configuration is used from application.yml in the resources.

If you have [grpc_cli](https://github.com/grpc/grpc/blob/master/doc/command_line_tool.md) installed, you can check that Feast Core is running
```
grpc_cli ls localhost:6565
grpc_cli call localhost:6565 GetFeastCoreVersion ""
grpc_cli call localhost:6565 ListStores ""
```