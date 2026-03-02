using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class LoginHistoryVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? LoginTime { get; set; }
        public string? IpAddress { get; set; }
        public string? Location { get; set; }
        public string? Device { get; set; }
        public string? Browser { get; set; }
        public string? Os { get; set; }
        public string? LoginMethod { get; set; }
        public string? Status { get; set; }
        public string? Result { get; set; }
        public string? FailureReason { get; set; }
    }
}
