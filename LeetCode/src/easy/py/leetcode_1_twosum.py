from typing import List


class Solution(object):
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums) - 1):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]

    def twoSum_hashTable(self, nums: List[int], target: int) -> List[int]:
        hashmap = {}
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in hashmap:
                return sorted([i, hashmap[complement]])
            hashmap[nums[i]] = i


if __name__ == '__main__':
    sol = Solution()
    print(sol.twoSum(nums=[2, 7, 11, 15], target=9))
    print(sol.twoSum(nums=[3, 2, 4], target=6))
    print(sol.twoSum(nums=[3, 3], target=6))
    print(sol.twoSum_hashTable(nums=[2, 7, 11, 15], target=9))
    print(sol.twoSum_hashTable(nums=[3, 2, 4], target=6))
    print(sol.twoSum_hashTable(nums=[3, 3], target=6))
