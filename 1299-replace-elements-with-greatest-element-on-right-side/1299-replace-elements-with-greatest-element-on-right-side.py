class Solution(object):
    def replaceElements(self, arr):
        max_val = -1

        for i in range(len(arr) - 1, -1, -1):
            current = arr[i]
            arr[i] = max_val
            max_val = max(max_val, current)

        return arr