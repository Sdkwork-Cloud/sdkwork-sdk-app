using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class TodoItemVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? Status { get; set; }
        public string? Priority { get; set; }
        public string? DueDate { get; set; }
        public string? CreateTime { get; set; }
        public string? UpdateTime { get; set; }
        public string? CompletedAt { get; set; }
        public string? Creator { get; set; }
        public string? Assignee { get; set; }
        public string? ResourceId { get; set; }
        public string? ResourceType { get; set; }
        public List<string>? Tags { get; set; }
        public int? Progress { get; set; }
        public string? ReminderTime { get; set; }
    }
}
