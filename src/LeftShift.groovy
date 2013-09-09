def pr = { y -> print y }
def f = { x -> x[2, 1, 0] }
def g = { x -> x[1, 0, 2] }

def x = ['a', 'b', 'c']
def y = g(x)
f(x)

def p = f << g
f(g(x))
f(y)
