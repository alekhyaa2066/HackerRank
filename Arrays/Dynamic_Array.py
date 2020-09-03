N, Q = map(int, input().split())
L = [[] for _ in range(N)]
lastAns = 0
for _ in range(Q):
    n, x, y = map(int, input().split())
    if n == 1:
        seq_number = (x^lastAns) % N
        L[seq_number].append(y)
    if n == 2:
        seq_number = (x^lastAns) % N
        lastAns = L[seq_number][y % len(L[seq_number])]
        print (lastAns)
