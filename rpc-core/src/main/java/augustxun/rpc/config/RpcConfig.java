package augustxun.rpc.config;

import augustxun.rpc.serializer.SerializerKeys;
import lombok.Data;

/**
 * RPC框架配置
 */
@Data
public class RpcConfig {
    /**
     * 名称
     */
    private String name = "xun-rpc";
    /**
     * 版本号
     */
    private String version = "1.0";
    /**
     * 服务器主机名
     */
    private String serverHost = "localhost";
    /**
     * 服务器端口号
     */
    private Integer serverPort = 8089;
    /**
     * 序列化器
     */
    private String serializer = SerializerKeys.JDK;
    /**
     * 模拟调用
     */
    private boolean mock = false;
}
