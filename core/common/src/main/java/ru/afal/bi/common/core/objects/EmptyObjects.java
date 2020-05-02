package ru.afal.bi.common.core.objects;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class EmptyObjects {

  @SuppressWarnings("rawtypes")
  private static final ConcurrentMap<Class, Object> EMPTY_OBJECT_MAP = new ConcurrentHashMap<>();

  @NotNull
  @SuppressWarnings("unchecked")
  public static <T> T get(@NotNull Class<T> clazz) {
    return (T) EMPTY_OBJECT_MAP.computeIfAbsent(clazz, EmptyObjects::newInstance);
  }

  @NotNull
  private static Object newInstance(@NotNull Class<?> c) {
    try {
      return c.getConstructor().newInstance();
    } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
      throw new IllegalArgumentException("Can't access constructor without parameters for class " + c, e);
    }
  }
}
