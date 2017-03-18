package org.telegram.abilitybots.api.db;

import java.io.Closeable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Addo on 2/11/2017.
 */
public interface DBContext extends Closeable{
    <T> List<T> getList(String name);

    <K, V> Map<K, V> getMap(String name);

    <T> Set<T> getSet(String name);

    <T> List<T> getGroupList(String name, long id);

    <K, V> Map<K, V> getGroupMap(String name, long id);

    <T> Set<T> getGroupSet(String name, long id);

    String summary();

    Object backup();
    boolean recover(Object backup);

    String setInfo(String setName);
    String groupSetInfo(String setName, long id);

    String listInfo(String listName);
    String groupListInfo(String listName, long id);

    String mapInfo(String mapName);
    String groupMapInfo(String mapName, long id);

    void commit();

    void clear();
}