package types

// 活动参与记录查询请求
type ActivityRecordQueryForm struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	ActivityId string `json:"activityId"`
	RecordType string `json:"recordType"`
	Size int `json:"size"`
	Page int `json:"page"`
}
