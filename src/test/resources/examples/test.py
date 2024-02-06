# 这是一个示例程序

str = '''
    字符串文本
    '''
'''q'''; str = '111'; '''q'''
'''
这是一个多行注释
'''
'''这是一个单行注释'''
def add(a, b):
    """
    这个函数用于求两个数的和
    参数: a - 第一个数
          b - 第二个数
    返回值: 两个数的和
    """

    # 计算两个数的和
    result = a + b

    return result

# 主函数
if __name__ == "__main__":
    # 输入两个数
    num1 = int(input("请输入第一个数: "))
    num2 = int(input("请输入第二个数: "))

    # 调用add函数计算和
    sum = add(num1, num2)

    # 输出结果
    print("两个数的和为:", sum)