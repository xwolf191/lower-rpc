package com.xwolf.rpc.serialize.kryo;

import com.xwolf.rpc.serialize.api.Serializer;

/**
 * kryo Serialize.
 *
 * @author xwolf
 */
public class KryoSerializer implements Serializer {

  @Override
  public byte[] serialize(String str) {
    return new byte[0];
  }

  @Override
  public byte[] serialize(Object obj) {

    return new byte[0];
  }

  @Override
  public <T> T deserialize(byte[] bytes) {
    return null;
  }
}
