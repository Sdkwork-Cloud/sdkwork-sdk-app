package types

// FAQ查询表单
type FaqQueryForm struct {
	CategoryId string `json:"categoryId"`
	Keyword string `json:"keyword"`
	Page int `json:"page"`
	Size int `json:"size"`
}
