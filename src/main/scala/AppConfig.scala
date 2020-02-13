import com.typesafe.config.{Config, ConfigFactory}

trait AppConfig {
  val config: Config = ConfigFactory.load("application.conf")

  lazy val kafkaHost: String = config.getString("kafkaConfig.host")
  lazy val kafkaPort: Int = config.getInt("kafkaConfig.port")
  lazy val kafkaTopic: String = config.getString("kafkaConfig.topic")
}