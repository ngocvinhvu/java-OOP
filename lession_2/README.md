# Abstraction and Encapsulation


## Ký hiệu cho chỉ đinh truy cập trong biểu diễn lớp:

- dấu - là private

- dấu + là public

- dấu # là protected

- underline is static

## Init 1 var object.
- new() make value of object in heap memory.
- Don't use "==" to compare 2 objects, because "==" gonna compare adress point to heap memory.
- User object1.equals(object2) (y) (Need to code method equals)
- Destuctor -> assign method = null, using finalize()

## Recycle (depending on JVM)
- System.gc();
- Runtime.gc();
- Cannot active recycle immediately, but recycle may sooner.

## Static method
- No need init.
