import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class AdaptiveReconciliation {
    private Map<String, Integer> versionMap;

    public AdaptiveReconciliation() {
        versionMap = new HashMap<>();
    }

    public void updateVersion(String key, int version) {
        versionMap.put(key, version);
    }

    public Set<String> reconcile(Set<String> localKeys, Map<String, Integer> remoteVersions) {
        Set<String> updates = new HashSet<>();

        for (String key : localKeys) {
            int localVersion = versionMap.getOrDefault(key, 0);
            int remoteVersion = remoteVersions.getOrDefault(key, 0);

            if (localVersion < remoteVersion) {
                updates.add(key);
            }
        }

        return updates;
    }

    public static void main(String[] args) {
        AdaptiveReconciliation reconciliation = new AdaptiveReconciliation();
        reconciliation.updateVersion("apple", 3);
        reconciliation.updateVersion("banana", 2);
        reconciliation.updateVersion("orange", 1);

        Set<String> localKeys = new HashSet<>(reconciliation.versionMap.keySet());

        Map<String, Integer> remoteVersions = new HashMap<>();
        remoteVersions.put("apple", 4);
        remoteVersions.put("kiwi", 1);

        Set<String> updates = reconciliation.reconcile(localKeys, remoteVersions);
        System.out.println("Updates needed: " + updates);
    }
}
