package ch16

type Sum struct {
	Augend Expression
	Addend Expression
}

func NewSum(augend, addend Expression) Sum {
	return Sum{
		Augend: augend,
		Addend: addend,
	}
}

func (s Sum) Reduce(bank Bank, to string) Money {
	amount := bank.Reduce(s.Augend, to).amount + bank.Reduce(s.Addend, to).amount
	return NewMoney(amount, to)
}

func (s Sum) Plus(addend Expression) Expression {
	return NewSum(s, addend)
}

func (s Sum) Times(multiplier int) Expression {
	return NewSum(s.Augend.Times(multiplier), s.Addend.Times(multiplier))
}