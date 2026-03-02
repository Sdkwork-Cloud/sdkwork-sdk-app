package types

// 图片OCR审核请求
type ImageOcrAuditForm struct {
	ImageUrl string `json:"imageUrl"`
	ContentId string `json:"contentId"`
	CheckTypes []string `json:"checkTypes"`
	Language string `json:"language"`
	ReturnFullText bool `json:"returnFullText"`
}
