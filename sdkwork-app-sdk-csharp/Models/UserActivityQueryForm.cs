using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserActivityQueryForm
    {
        public string? StartDate { get; set; }
        public string? EndDate { get; set; }
        public string? ActivityType { get; set; }
        public string? UserId { get; set; }
        public int? PageSize { get; set; }
        public int? PageNum { get; set; }
    }
}
