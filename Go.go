package main

import (
	"fmt"
)

func main() {
	var a [1000]float64
	var b [1000]float64
	var c [1000]float64
	var v [1000]float64
	var n, i int
	fmt.Scan(&n)

	for i = 0; i < n; i++ {
		fmt.Scan(&a[i])
		fmt.Scan(&b[i])
		fmt.Scan(&c[i])
	}
	for i = 0; i < n; i++ {
		v[i] = (a[i]*2 + b[i]*3 + c[i]*5) / 10
		fmt.Printf("%.1f\n", v[i])
	}
}
