package types

// 移动分类请求
type CategoryMoveForm struct {
	TargetParentId int `json:"targetParentId"`
}
