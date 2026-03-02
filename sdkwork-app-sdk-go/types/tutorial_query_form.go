package types

// 教程查询表单
type TutorialQueryForm struct {
	CategoryId string `json:"categoryId"`
	Keyword string `json:"keyword"`
	Page int `json:"page"`
	Size int `json:"size"`
}
