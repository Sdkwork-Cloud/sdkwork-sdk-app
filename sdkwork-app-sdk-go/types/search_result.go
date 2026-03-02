package types


type SearchResult struct {
	Id string `json:"id"`
	Title string `json:"title"`
	Content string `json:"content"`
	Type string `json:"type"`
	Path string `json:"path"`
}
