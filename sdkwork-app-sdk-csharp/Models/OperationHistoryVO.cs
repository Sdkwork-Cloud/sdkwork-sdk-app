using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OperationHistoryVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Action { get; set; }
        public string? Description { get; set; }
        public string? TargetType { get; set; }
        public string? TargetId { get; set; }
        public string? TargetName { get; set; }
        public string? Result { get; set; }
        public string? OperationTime { get; set; }
        public string? IpAddress { get; set; }
        public string? UserAgent { get; set; }
    }
}
