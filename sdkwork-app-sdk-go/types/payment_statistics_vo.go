package types


type PaymentStatisticsVO struct {
	TotalPayments int `json:"totalPayments"`
	PendingPayments int `json:"pendingPayments"`
	SuccessPayments int `json:"successPayments"`
	FailedPayments int `json:"failedPayments"`
	ClosedPayments int `json:"closedPayments"`
	TimeoutPayments int `json:"timeoutPayments"`
}
