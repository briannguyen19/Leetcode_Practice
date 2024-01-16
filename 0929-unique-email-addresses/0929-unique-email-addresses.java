class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> unique = new HashSet<>();
        for (String ele : emails) {
            String[] parts = ele.split("@");
            String local = parts[0].split("\\+")[0];
            local = local.replace(".", "");
            
            String normalizedEmail = local + "@" + parts[1];
            unique.add(normalizedEmail);
        }
        return unique.size();
    }
}