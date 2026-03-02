package types

// 待办事项响应
type TodoItemVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Title string `json:"title"`
	Description string `json:"description"`
	Status string `json:"status"`
	Priority string `json:"priority"`
	DueDate string `json:"dueDate"`
	CreateTime string `json:"createTime"`
	UpdateTime string `json:"updateTime"`
	CompletedAt string `json:"completedAt"`
	Creator string `json:"creator"`
	Assignee string `json:"assignee"`
	ResourceId string `json:"resourceId"`
	ResourceType string `json:"resourceType"`
	Tags []string `json:"tags"`
	Progress int `json:"progress"`
	ReminderTime string `json:"reminderTime"`
}
