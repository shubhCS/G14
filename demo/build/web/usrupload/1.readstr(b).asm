.data
msg:.asciiz "Enter the string"
str:.space 64
.text
.globl main
main:
	li $v0,4
	la $a0,msg
	syscall
	li $v0,8
	li $a1,64
	la $a0,str
	syscall
	li $v0,4
	la $a0,str
	syscall
	li $v0,10
	syscall
	