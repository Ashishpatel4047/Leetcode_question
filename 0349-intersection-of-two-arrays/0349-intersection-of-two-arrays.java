class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int num : nums1) {
            s1.add(num);
        }

        for (int num : nums2) {
            s2.add(num);
        }

        if (s1.size() > s2.size()) {

            int[] res = new int[s1.size()];
            int k = 0;

            for (int num : s1) {
                if (s2.contains(num)) {
                    res[k] = num;
                    k++;
                }
            }

            return Arrays.copyOfRange(res, 0, k);

        } else {

            int[] res = new int[s2.size()];
            int k = 0;

            for (int num : s2) {
                if (s1.contains(num)) {
                    res[k] = num;
                    k++;
                }
            }

            return Arrays.copyOfRange(res, 0, k);
        }
    }
}