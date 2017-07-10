package com.onlyisssilence.muya.netdemo4.redis;

import redis.clients.jedis.ShardedJedis;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-07-11
 * Time: 上午 12:04
 */
public interface RedisDataSource {
    public abstract ShardedJedis getRedisClient();

    public void returnResource(ShardedJedis shardedJedis);

    public void returnResource(ShardedJedis shardedJedis, boolean broken);
}
