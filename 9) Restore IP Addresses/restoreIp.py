def is_valid(s):
    return len(s) <= 3 and (len(s) == 1 or s[0] != '0') and int(s) <= 255

def restore_ip_addresses(s):
    result = []
    n = len(s)

    for i in range(1, min(4, n - 2)):
        for j in range(i + 1, min(i + 4, n - 1)):
            for k in range(j + 1, min(j + 4, n)):
                a = s[:i]
                b = s[i:j]
                c = s[j:k]
                d = s[k:]

                if is_valid(a) and is_valid(b) and is_valid(c) and is_valid(d):
                    result.append(a + "." + b + "." + c + "." + d)

    return result

if __name__ == "__main__":
    s = "25525511135"  # Example input
    ips = restore_ip_addresses(s)

    print("Valid IP addresses:", ips)
