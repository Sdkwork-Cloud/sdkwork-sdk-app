using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DepartmentCreateForm
    {
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Description { get; set; }
        public int? OwnerId { get; set; }
        public int? ParentId { get; set; }
        public int? SortOrder { get; set; }
        public int? ManagerId { get; set; }
        public string? Phone { get; set; }
        public string? Email { get; set; }
    }
}
