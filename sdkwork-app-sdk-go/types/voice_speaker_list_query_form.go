package types

// 说话人列表查询请求
type VoiceSpeakerListQueryForm struct {
	Gender string `json:"gender"`
	Language string `json:"language"`
	Style string `json:"style"`
	AgeRange string `json:"ageRange"`
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	OnlyFavorite bool `json:"onlyFavorite"`
}
