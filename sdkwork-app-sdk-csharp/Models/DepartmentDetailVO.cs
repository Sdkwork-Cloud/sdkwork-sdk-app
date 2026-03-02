using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DepartmentDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Description { get; set; }
        public int? OwnerId { get; set; }
        public int? ParentId { get; set; }
        public int? Level { get; set; }
        public bool? IsActive { get; set; }
        public int? SortOrder { get; set; }
        public TreeNodePath? TreePath { get; set; }
        public string? FullPathName { get; set; }
        public int? ManagerId { get; set; }
        public string? Phone { get; set; }
        public string? Email { get; set; }
        public int? MemberCount { get; set; }
        public int? ChildrenCount { get; set; }
    }
}
