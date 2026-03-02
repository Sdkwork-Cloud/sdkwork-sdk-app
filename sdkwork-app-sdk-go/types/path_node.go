package types


type PathNode struct {
	Id int `json:"id"`
	Name string `json:"name"`
	Code string `json:"code"`
	Level int `json:"level"`
	IsCurrent bool `json:"isCurrent"`
}
