def basicmath (op, v1, v2):
    map = {
        "+": v1 + v2,
        "-": v1 - v2,
        "*": v1 * v2,
        "/": v1 / v2,
    }

    return map[op]