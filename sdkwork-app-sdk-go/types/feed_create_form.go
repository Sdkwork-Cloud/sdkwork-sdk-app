package types

// Feed create form
type FeedCreateForm struct {
	Content string `json:"content"`
	Title string `json:"title"`
	CategoryId int `json:"categoryId"`
	Images []string `json:"images"`
	Source string `json:"source"`
	SourceUrl string `json:"sourceUrl"`
}
