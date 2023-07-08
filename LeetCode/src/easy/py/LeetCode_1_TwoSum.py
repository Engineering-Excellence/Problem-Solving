class Solution(object):
    def twoSum(self, nums: list, target: int) -> list:
        for i in range(len(nums) - 1):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]


if __name__ == '__main__':
    sol = Solution()
    print(sol.twoSum(nums=[2, 7, 11, 15], target=9))
    print(sol.twoSum(nums=[3, 2, 4], target=6))
    print(sol.twoSum(nums=[3, 3], target=6))
