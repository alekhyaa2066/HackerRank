def mutate_string(string, position, character):
    a=list(string)
    a[position]=character
    x=''.join(a)
    return x