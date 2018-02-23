package info.xiancloud.plugin.zookeeper.service_discovery_new.unit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import info.xiancloud.plugin.distribution.UnitProxy;
import info.xiancloud.plugin.zookeeper.utils.FastJsonServiceInstanceSerializer;
import org.apache.curator.x.discovery.ServiceInstance;

/**
 * @deprecated some reason I have forget. I need time to think of this.
 */
public class ZkUnitInstanceSerializer extends FastJsonServiceInstanceSerializer<UnitProxy> {

    @Override
    public ServiceInstance<UnitProxy> deserialize(byte[] bytes) {
        return JSON.parseObject(new String(bytes), new TypeReference<ServiceInstance<UnitProxy>>() {
        });
    }

}
