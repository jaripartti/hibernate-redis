package org.hibernate.search.redis;

import org.hibernate.search.spi.BuildContext;
import org.hibernate.search.spi.ServiceProvider;

import java.util.Properties;

/**
 * org.hibernate.search.redis.CacheManagerServiceProvider
 *
 * @author sunghyouk.bae@gmail.com
 * @since 13. 4. 3. 오후 8:26
 */
public class CacheManagerServiceProvider implements ServiceProvider<RedisCacheManager> {

    @Override
    public void start(Properties properties, BuildContext context) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public RedisCacheManager getService() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void stop() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}