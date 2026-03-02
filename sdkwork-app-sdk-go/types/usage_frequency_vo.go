package types

// 使用频率分布
type UsageFrequencyVO struct {
	Monday int `json:"monday"`
	Tuesday int `json:"tuesday"`
	Wednesday int `json:"wednesday"`
	Thursday int `json:"thursday"`
	Friday int `json:"friday"`
	Saturday int `json:"saturday"`
	Sunday int `json:"sunday"`
}
