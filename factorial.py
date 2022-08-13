def fact(N):
    return N if N == 1 else N * fact(N-1)

print(fact(5))