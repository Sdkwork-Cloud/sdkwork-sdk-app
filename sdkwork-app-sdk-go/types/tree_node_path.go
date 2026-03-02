package types


type TreeNodePath struct {
	Nodes []PathNode `json:"nodes"`
	Level int `json:"level"`
	Depth int `json:"depth"`
	PathName string `json:"pathName"`
	RootNode PathNode `json:"rootNode"`
	ParentNode PathNode `json:"parentNode"`
	PathIds []int `json:"pathIds"`
	CurrentNode PathNode `json:"currentNode"`
}
