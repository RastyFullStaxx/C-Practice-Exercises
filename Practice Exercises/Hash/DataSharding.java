import java.util.HashMap;
import java.util.Map;

class DataSharding {
    private Map<String, Map<String, Object>> shards;

    public DataSharding() {
        shards = new HashMap<>();
    }

    public void addShard(String shardName) {
        shards.put(shardName, new HashMap<>());
    }

    public void removeShard(String shardName) {
        shards.remove(shardName);
    }

    public void put(String key, Object value) {
        String shardName = getShardName(key);
        shards.get(shardName).put(key, value);
    }

    public Object get(String key) {
        String shardName = getShardName(key);
        return shards.get(shardName).get(key);
    }

    private String getShardName(String key) {
        // Example implementation: Assign shard based on the first character of the key
        return key.substring(0, 1);
    }

    public static void main(String[] args) {
        DataSharding sharding = new DataSharding();
        sharding.addShard("Shard A");
        sharding.addShard("Shard B");

        sharding.put("apple", 10);
        sharding.put("banana", 20);

        System.out.println("Value for 'apple': " + sharding.get("apple"));
        System.out.println("Value for 'kiwi': " + sharding.get("kiwi"));
    }
}
